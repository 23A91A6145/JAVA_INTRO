public class Method1 {
    public void playMusic() {
        System.out.println("music playing");
    }

    public String getPen(int cost) {
        if (cost >= 5)
            return "pen";
        else
            return "none";
    }
 //}

// class Demo {
    public static void main(String args[]) {
        Method1 obj = new Method1();
        obj.playMusic();
        String str = obj.getPen(6);
        System.out.println(str);
    }
}
