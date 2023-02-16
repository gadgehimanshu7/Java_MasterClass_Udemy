public class Main {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            Student s = new Student("a123"+i,
                    switch(i) {
                        case 1 -> "hima";
                        case 2 -> "pc";
                        case 3 -> "garu";
                        case 4 -> "ganya";
                        case 5 -> "ajya";
                        default -> "Anonymous";
                    },
                    "04/10/1999",
                    "java masterclass");
            System.out.println(s);

        }
        Student pojo=new Student("12345","abcd","12/12/1999","python");
        LPAStudent RecordS=new LPAStudent("54321","IJKL","9/9/1998","DANCE");
        System.out.println(pojo);
        System.out.println(RecordS);


    }
}
