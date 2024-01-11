class Mall{
    String name;
    Mall(String name){
        this.name = name;
       System.out.println(this.name);
    }
    Mall(){
        System.out.println("No name given");
    }
    
}
class Inox extends Mall{

    Inox(int time){
    
        System.out.println("4th floor of the mall");
    }
    Inox(int time,String name){
        
        this.name = name;
        System.out.println("4th floor of the mall");
    }
    public static void printloc(String name){
        System.out.println("Location is "+name);
    }
}

class fp3{
 public static void main(String[] args){
    Inox gsm = new Inox(10);
    Mall etc = new Inox(5,"madinaguda");
    Inox.printloc("Madinaguda");
    System.out.println(gsm.name);
    System.out.println(etc.name);
 }
}
