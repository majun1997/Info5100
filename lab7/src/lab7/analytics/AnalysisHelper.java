/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
    DataStore dataStore;
    public AnalysisHelper(){
        dataStore=DataStore.getInstance();
    }
    /**
     * @author JunMA
     */
    public double FNALPC(){
        double re=0;
        int count=0;
        Map<Integer, Comment> com=DataStore.getInstance().getComments();
        ArrayList<Comment> comm=new ArrayList(com.values());
        for(Comment c:comm){
            
            re+=c.getLikes();
            count++;
        }
        
        return re/count;
    }
    /**
     * @author JunMA
     */
    public ArrayList<Comment> FPWMLC(){
      
        Map<Integer, Comment> com=DataStore.getInstance().getComments();
        ArrayList<Comment> comm=new ArrayList(com.values());
        Collections.sort(comm,new Comparator<Comment>(){
        @Override
        public int compare(Comment o1,Comment o2){
            return o2.getLikes()-o1.getLikes();
        }
        });
        return comm;
    }
    /**
     * @author JunMA
     */
    public ArrayList<Post> FPWMC(){
        
        Map<Integer, Post> pos=DataStore.getInstance().getPosts();
        ArrayList<Post> post=new ArrayList(pos.values());
        Collections.sort(post,new Comparator<Post>(){
        @Override
        public int compare(Post o1,Post o2){
            return o2.getComments().size()-o1.getComments().size();
        }
        });

        return post;
    }
    // find 5 comments which have the most likes
    // TODO
    /**
     * @author YuChen
     * @return 
     */
    public ArrayList<User> T5IUBTPN(){
        ArrayList<User> re=new ArrayList<User>(dataStore.getUsers().values());
        Collections.sort(re,new Comparator<User>(){
        @Override
        public int compare(User o1,User o2){
            return o1.getPosts().size()-o2.getPosts().size();
        }
        });
        return re;
    }
        /**
     * @author YuChen
     * @return 
     */
    public ArrayList<User> T5IUBTCN(){
        ArrayList<User> re=new ArrayList<User>(dataStore.getUsers().values());
        Collections.sort(re,new Comparator<User>(){
        @Override
        public int compare(User o1,User o2){
            return o1.getComments().size()-o2.getComments().size();
        }
        });
        return re;
    }
    /**
     * @author QiushiZhang
     */
    public int getLike(List<Comment> o1){
        int re=0;
        for(Comment c:o1){
                re+=c.getLikes();
        }
        return re;
    }
    /**
     * @author QiushiZhang
     */
    public ArrayList<User> T5UO(){
        ArrayList<User> re=new ArrayList<User>(dataStore.getUsers().values());
        Collections.sort(re,new Comparator<User>(){
        @Override
        public int compare(User o1,User o2){
            
            int o1l=getLike(o1.getComments());
            int o2l=getLike(o2.getComments());           
            return o1l-o2l+o1.getComments().size()-o2.getComments().size()+o1.getPosts().size()-o2.getPosts().size();
        }
        });
        return re;
    }
}
