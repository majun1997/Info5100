/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import lab7.analytics.AnalysisHelper;
import lab7.analytics.DataStore;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class Lab7 {

    DataReader commentReader;
    DataReader userReader;
    AnalysisHelper helper;
    public Lab7() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();

        commentReader = new DataReader(generator.getCommentFilePath());
        userReader = new DataReader(generator.getUserCataloguePath());
        helper = new AnalysisHelper();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {     
        Lab7 inst = new Lab7();
        inst.readData();
        
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = userReader.getNextRow()) != null ){
            generateUser(row);
        }
        while((row = commentReader.getNextRow()) != null ){
            Comment comment = generateComment(row);
            generatePost(row, comment);
        }
        runAnalysis();
    }
    
    private void generateUser(String[] row){
        // TODO
        User u=new User(Integer.parseInt(row[0]),row[1],row[2]);
        DataStore.getInstance().getUsers().put(Integer.parseInt(row[0]), u);
        
    }
    
    private Comment generateComment(String[] row){
        // TODO
        //public Comment(int id, int userId, int postId, String text, int likes) 
        Comment re=new Comment(Integer.parseInt(row[0]),Integer.parseInt(row[4]),Integer.parseInt(row[1]),row[5],Integer.parseInt(row[3]));
        
        DataStore.getInstance().getComments().put(Integer.parseInt(row[0]), re);
        if(DataStore.getInstance().getUsers().containsKey(Integer.parseInt(row[4])))
        {
            DataStore.getInstance().getUsers().get(Integer.parseInt(row[4])).getComments().add(re);
        }
        return re;
    }
    
    private void generatePost(String[] row, Comment comment){
        // TODO
        //int postId, int userId
        int postID=Integer.parseInt(row[1]);
        int userID=Integer.parseInt(row[2]);
        if(DataStore.getInstance().getPosts().containsKey(postID))
        {
            DataStore.getInstance().getPosts().get(postID).getComments().add(comment);
        }
        else
        {
            Post post=new Post(postID,userID);
            DataStore.getInstance().getUsers().get(userID).getPosts().add(post);
            post.getComments().add(comment);
            DataStore.getInstance().getPosts().put(postID, post);
        }
        
    }
    
    private void runAnalysis(){
        // TODO
        //edit by junma
        System.out.println("-- this is Find Average number of likes per comment.");
        System.out.println(helper.FNALPC());
        ArrayList<Comment> fpwmlc=helper.FPWMLC();
        System.out.println("-- this is Find the post with most liked comments.");
        int i=0;
         
        while(fpwmlc.get(0).getLikes()==fpwmlc.get(i).getLikes()){
            System.out.println("the most liked comment is in the "+DataStore.getInstance().getPosts().get(fpwmlc.get(i).getPostId())+" likes: "+fpwmlc.get(i).getLikes()+" and commentid: "+fpwmlc.get(i).getId());
            i++;
            
        }       
        ArrayList<Post> fpwmc=helper.FPWMC();        
        System.out.println("--this is Find the post with most comments.--");
        i=0;
        while(fpwmc.get(i).getComments().size()==fpwmc.get(0).getComments().size()){
                    System.out.println("the post with most comments: "+fpwmc.get(i)+"the comments is "+fpwmc.get(i).getComments().size());
                    i++;
        }
    //edit by yuchen
    ArrayList<User> t5iubtpn=helper.T5IUBTPN();
        int z=0;
        System.out.println("--this is Top 5 inactive users based on total Posts they created.--");
        for(i=0;i<5;){
            System.out.println((i+1)+"th:");
            System.out.println(t5iubtpn.get(i));
            while(t5iubtpn.get(i).getPosts().size()==t5iubtpn.get(++i).getPosts().size())
                System.out.println(t5iubtpn.get(i));
        }
        ArrayList<User> t5iubtcn=helper.T5IUBTCN();
        System.out.println("--this is Top 5 inactive users  based on total comments.--");
        for(i=0;i<5;){
            System.out.println((i+1)+"th:");
            System.out.println(t5iubtcn.get(i));
            while(t5iubtcn.get(i).getComments().size()==t5iubtcn.get(++i).getComments().size())
                System.out.println(t5iubtcn.get(i));
            
        }
        //edit by QiushiZhang
        ArrayList<User> t5uo=helper.T5UO();
        System.out.println("--this is Top 5 inactive users overall.--");
        for(i=0;i<5;){
            System.out.println((i+1)+"th:");
            System.out.println(t5uo.get(i)+" and the sum of likes about his like is "+helper.getLike(t5uo.get(i).getComments()));
            while(t5uo.get(i).getComments().size()+t5uo.get(i).getPosts().size()+helper.getLike(t5uo.get(i).getComments())==t5uo.get(++i).getComments().size()+t5uo.get(i).getPosts().size()+helper.getLike(t5uo.get(i).getComments()))
                System.out.println(t5uo.get(i)+" and the sum of likes about his like is "+helper.getLike(t5uo.get(i).getComments()));

        }
        System.out.println("--this is Top 5 proactive users overall.--");
        for(i=0;i<5;){
            System.out.println((i+1)+"th:");
            System.out.println(t5uo.get(t5uo.size()-1-i)+" and the sum of likes about his post is "+helper.getLike(t5uo.get(t5uo.size()-1-i).getComments()));
            while(t5uo.get(t5uo.size()-1-i).getComments().size()+t5uo.get(t5uo.size()-1-i).getPosts().size()+helper.getLike(t5uo.get(t5uo.size()-1-i).getComments())==t5uo.get(t5uo.size()-1-(++i)).getComments().size()+t5uo.get(t5uo.size()-1-i).getPosts().size()+helper.getLike(t5uo.get(t5uo.size()-1-i).getComments()))
                System.out.println(t5uo.get(t5uo.size()-1-i)+" and the sum of likes about his post is "+helper.getLike(t5uo.get(t5uo.size()-1-i).getComments()));
        }
        
    }
}
