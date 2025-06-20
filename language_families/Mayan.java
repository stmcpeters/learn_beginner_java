// creates the Mayan class that inherits from Langauge class
class Mayan extends Language {
    /*
    constructor has common traits (name, number of speakers) that don't need to be passed in when creating a new Mayan language object
     */
    Mayan (String name, int numSpeakers){
        super(name, numSpeakers, "Central America", "verb-object-subject");
    }

    /*
    overriding getInfo() method
     */
    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }
}