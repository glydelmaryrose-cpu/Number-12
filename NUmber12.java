
/**
 * Write a description of class NUmber12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NUmber12
{
    public static void main(String [] args){
    
        int [] arr = {1, 2, 3, 2, 2, 4};
        int target = 2;
        int count = 0;
        for (int num : arr){
            if (num == target){
                count++;
            }
        }
        if (count >= 3){
            System.out.println(target + " appears at least 3 times.");
        } else {
            System.out.println(target + " does not appear at least 3 times.");
        }
    }
}