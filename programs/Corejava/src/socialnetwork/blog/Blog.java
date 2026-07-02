package socialnetwork.blog;


import socialnetwork.User;

public class Blog {

    User blogUser ;
    String imageFile;
    String videoFile;
    String audioFile;

    public void assignUser(User user) {
        this.blogUser = user;
    }

    public void uploadVideo(String vdfile){
       this.videoFile = vdfile;
   }

    public void uploadImage(String imaefile){
        this.imageFile = imaefile;
    }

    public void uploadAudio(String audio){
        this.audioFile = audio;
    }


}
