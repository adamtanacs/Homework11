public class Console {
    public static void main(String[] args) {
        Hallgato testHallgato = new Hallgato("Bob", 20020909);
        Hallgato testHallgato2 = new Hallgato("Bob", 20020909);
        System.out.println((testHallgato.equals(testHallgato2)));
        System.out.println((testHallgato.equals(testHallgato2) 
                            && testHallgato2.equals(testHallgato)));
        Hallgato testHallgato3 = testHallgato;
        System.out.println((testHallgato.equals(testHallgato2) &&
                            testHallgato2.equals(testHallgato3) &&
                            testHallgato.equals(testHallgato3)));
        
        testHallgato2 = new Hallgato("Anna", 20020909);
        System.out.println((testHallgato.equals(testHallgato2)));
        System.out.println((testHallgato.equals(testHallgato2) 
                            && testHallgato2.equals(testHallgato)));
        System.out.println((testHallgato.equals(testHallgato2) &&
                            testHallgato2.equals(testHallgato3) &&
                            testHallgato.equals(testHallgato3)));
        
        Hallgato testHallgato4 = new Hallgato("Adam", 20020827);
        Hallgato testHallgato5 = new Hallgato("Gabor", 19750928);
        Hallgato testHallgato6 = new Hallgato("Maria", 19770506);
        System.out.println(testHallgato.hashCode());
        System.out.println(testHallgato2.hashCode());
        System.out.println(testHallgato3.hashCode());
        System.out.println(testHallgato4.hashCode());
        System.out.println(testHallgato5.hashCode());
        System.out.println(testHallgato6.hashCode());
    }
}
