public class DailyRoutineWithBoolean {
    public static void main(String[] args) {
        var alarm = true;
        var bath = true;
        var breakfast = true;
        var learn = true;
        var homework = true;
        var hungry = true;
        var sleep = true;

        if(alarm) {
            System.out.println("Wake Up");
        }
        else {
            System.out.println("Not Waking Up");
        }
        System.out.println("Go to Bathroom");

        if(bath) {
            System.out.println("Do not Take Bath");
        }
        else {
            System.out.println("Take Bath");
        }
        System.out.println("Go to Breakfast");

        if (breakfast) {
            System.out.println("Eat Breakfast");
        }
        else {
            System.out.println("Do not Eat Breakfast");
        }
        System.out.println("Go to Learn");

        if (learn) {
            System.out.println("Continue To Learn");
        }
        else {
            System.out.println("Do not learn");
        }
        System.err.println("Go to Homework");

        if (homework) {
            System.out.println("Do Homework");
        }
        else {
            System.out.println("Do not do Homework");
        }
        System.out.println("Go to sleep");

        if(sleep) {
            System.out.println("Sleep");
        }
        else {
            System.out.println("Do not Sleep");
        }
    }
}
