public class MadLibs {
    /*
    creating a madlibs story using java
    */
    public static void main(String[] args){
        String name1 = "steph";
        String adjective1 = "giant";
        String adjective2 = "far";
        String adjective3 = "blue";
        String verb1 = "ran";
        String noun1 = "cat";
        String noun2 = "truck";
        String noun3 = "pants";
        String noun4 = "phone";
        String noun5 = "desk";
        String noun6 = "person";
        String name2 = "bob";
        int number = 15;
        String place1 = "frisco";


        //The template for the story
        String story = "This morning "+ name1 +" woke up feeling "+ adjective1 +". 'It is going to be a "+ adjective2 +" day!' Outside, a bunch of "+ noun1 +"s were protesting to keep "+ noun2 +" in stores. They began to "+ verb1 +" to the rhythm of the "+ noun3 +", which made all the "+ noun4 + "s very "+ adjective3 +". Concerned, "+ name1 +" texted "+ name2 +", who flew "+ name1 +" to "+ place1 +" and dropped "+ name1 +" in a puddle of frozen "+ noun5 +". "+ name1 +" woke up in the year "+ number +", in a world where "+ noun6 +"s ruled the world.";

        System.out.println(story);
    }
}
