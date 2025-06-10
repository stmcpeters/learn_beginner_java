class SinoTibetan extends Language {
    /*
    constructor has common traits (name, number of speakers) that don't need to be passed in when creating a new SinoTibetan language object
    */
    SinoTibetan (String name, int numSpeakers){
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}