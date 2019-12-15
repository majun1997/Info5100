/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author 52909
 */
public class CarList {
    private ArrayList<Car> carList;
    private int total;
    public CarList()
    {
        carList=new ArrayList<Car>();
        total=0;
    }

    public CarList(int i) {
        carList=new ArrayList<Car>();
        total=10;
        carList.add(new Car(true,"BMW","New Youk",2010,2020,1,5,"Jeep","X5","000000000000",new Point(100,100)));
        carList.add(new Car(true,"BMW","New Youk",2013,2021,1,5,"Jeep","X3","000000000001",new Point(105,105)));
        carList.add(new Car(false,"BMW","Boston",2015,2018,1,5,"Jeep","X1", "000000000002",new Point(1000,1000)));
        carList.add(new Car(true,"Ferrari","New York",2005,2020,1,2,"Speed","430","000001",new Point(96,100)));
        carList.add(new Car(false,"Ferrari","Boston",2010,2025,1,2,"Speed","430","000002",new Point(996,1007)));
        carList.add(new Car(true,"Toyoto","New Youk",2018,2025,1,5,"Business Car","A1","12345445",new Point(100,100)));
        carList.add(new Car(false,"Toyoto","Boston",2016,2021,1,5,"Business Car","A1","12345654",new Point(1007,1060)));
        carList.add(new Car(true,"Hongqi","Boston",2017,2022,1,5,"Business Car","O1","1234567123",new Point(1080,1006)));
        carList.add(new Car(false,"Hongqi","New Youk",2013,2018,1,5,"Business Car","O2","12345679",new Point(100,100)));
        carList.add(new Car(true,"GM","New Youk",2012,2017,1,5,"Business Car","T3","00001",new Point(100,100)));
        carList.add(new Car(false,"GM","Boston",2019,2025,1,5,"Business Car","G3","00002",new Point(1080,1070)));
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    public Car addCar()
    {
        Car car=new Car();
        carList.add(car);
        total++;
        return car;
    }
    public void addCar(Car a)
    {
        
        carList.add(a);
        total++;
        
    }
    public Car findBySerial(String serial)
    {
       
        for(Car car:carList)
        {
            if(car.getSerialNumber().equals(serial))
                return car;
        }
        return null;
    }
    public void deleteCar(Car car)
    {
        carList.remove(car);
        total--;
    }
    public Car findFirst(Point x)
    {
        double distance=Double.MAX_VALUE;
        Car reCar=null;
        for(Car car:carList)
        {
            if(car.isAvailable()==true)
            {
                if(distance>x.getDistance(car.getX()))
                {
                    distance=x.getDistance(car.getX());
                    reCar=car;
                }
            }                
        }
        return reCar;
    }
    public int availableNumber()
    {
        int a=0;
        for(Car car:carList)
        {
            if(car.isAvailable())
                a++;
        }
        return a;
    }
    public int getTotal() {
        return total;
    }
    public ArrayList<Car> findByBrand(String brand)
    {
        ArrayList<Car> re=new ArrayList<Car>();
        for(Car car:carList)
        {
            if(car.getBrand().equals(brand))
                re.add(car);
        }
        return re;
    }
    
    public Car findBySeats(int min,int max)
    {
        
        for(Car car:carList)
        {
            if(car.isAvailable()==true)
            {
                if(car.getMinseats()>min && car.getMaxseats()<max)
                    return car;
            }                
        }
        return null;
    }
    public ArrayList<Car> findByModelNumber(String number)
    {
        ArrayList<Car> re=new ArrayList<Car>();
        for(Car car:carList)
        {
            if(car.getModelNumber().equals(number))
                re.add(car);
        }
        return re;
    }
    public ArrayList<String> findManufacturers()
    {
        //find all brand and use hashset delete the same brand;
        ArrayList<String> re=new ArrayList<String>();
        for(Car car:carList)
        {
            re.add(car.getBrand());            
        }
        re = new ArrayList<>(new HashSet<>(re));
        return re;
    }
    
    public ArrayList<Car> findByCityAndAvailable(String city)
    {
        ArrayList<Car> re=new ArrayList<Car>();
        for(Car car:carList)
        {
            if(car.isAvailable() && car.getCity().equals(city))
                re.add(car);
        }
        return re;
    }
}
