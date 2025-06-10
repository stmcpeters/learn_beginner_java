class Language {
// instantiate variables
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

// constructor for creating a new language object
    public Language (String name, int numSpeakers, String regionsSpoken, String wordOrder){
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

// method to display all info for language object
    public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order: " + wordOrder + ".");
    }

    public static void main(String[] args) {
// testing language constructor
//        Language spanish = new Language("English", 7000000, "United States and United Kingdom", "subject-verb-object");
//        spanish.getInfo();
//
// testing creating new Mayan object
//        Mayan sakapultek = new Mayan("Sakapultek", 6500);
//        sakapultek.getInfo();
//
// testing creating 2 new SinoTibetan language objects
//        SinoTibetan mandarinChinese = new SinoTibetan("Mandarin Chinese", 800000);
//        mandarinChinese.getInfo();
//
//        SinoTibetan burmese = new SinoTibetan("Burmese", 6000);
//        burmese.getInfo();

        /*
        ------ BONUS -------
        creating an ArrayList of language objects to loop through and print getInfo() for each
        */
// Language parent class with child classes Mayan and SinoTibetan
        Language spanish, sakapultek, mandarinChinese, burmese;

        spanish = new Language("English", 7000000, "United States and United Kingdom", "subject-verb-object");
        sakapultek = new Mayan("Sakapultek", 6500);
        mandarinChinese = new SinoTibetan("Mandarin Chinese", 800000);
        burmese = new SinoTibetan("Burmese", 6000);
// set up array with instances of each language
        Language[] listOfLanguages = {spanish, sakapultek, mandarinChinese, burmese};
// iterate thru list of languages and display info using getInfo()
        for (Language language : listOfLanguages){
            language.getInfo();
        }
    }
}