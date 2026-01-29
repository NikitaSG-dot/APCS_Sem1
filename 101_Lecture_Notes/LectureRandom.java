/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
        System.out.println(Math.random()*5);
        System.out.println(Math.random()*20+15);
        System.out.println(Math.random()*1051+1472);
        System.out.println((int)(Math.random()*(513-(-342))-342));
        int x = (int)(Math.random()*(75-30)+30);
        int y = (int)(Math.random()*(160-80)+80);
        System.out.println((int)(Math.random()*(y-x)+x));
	}
}
