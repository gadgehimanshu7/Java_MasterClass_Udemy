public class Main {
    public static void main(String[] args) {
        VipConstructor vipConstructor=new VipConstructor();
        System.out.println(vipConstructor.getName());
        System.out.println(vipConstructor.getCreditLimit());
        System.out.println(vipConstructor.getEmailAddress());

        VipConstructor vipConstructor1=new VipConstructor("nmjk",13490);
        System.out.println(vipConstructor1.getName());
        System.out.println(vipConstructor1.getEmailAddress());
        System.out.println(vipConstructor1.getCreditLimit());

        VipConstructor vipConstructor2=new VipConstructor("abcdefg",137879,"lkjhg@gmail.com");
        System.out.println(vipConstructor2.getName());
        System.out.println(vipConstructor2.getEmailAddress());
        System.out.println(vipConstructor2.getCreditLimit());
    }
}
