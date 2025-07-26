package day36_inheritance.app;

public class Application {
    String name;
    double version;

    public Application(String name,double version) {
        super();
        this.name = name;
        this.version = version;
    }
      public void download (){
          System.out.println(name + "downloading " + version + " version");
      }

    }

