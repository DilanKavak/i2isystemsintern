import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import java.util.HashMap;

public class findNumberAgain {

        static HashMap<Integer, Integer> map;
        static Logger logger = LogManager.getLogger(findNumberAgain.class);
        //DOMConfigurator.configure("src/main/resources/log4j.xml");

        public static void findNumberAgainTest(int[] findNumber){
            map = new HashMap<Integer, Integer>();
            logger.info("hasmap is loading...");
            for (int i : findNumber) {
                if (map.get(i) == null) {
                    logger.info(i + "added map");
                    map.put(i, 1);
                } else {
                    logger.info(i + " repeat second time");
                    System.out.println("repeating number : " + i);
                    break;

                }
            }

        }

        public static void main(String[] args) {
            DOMConfigurator.configure("src/main/resources/log4j.xml");
            int[] arraytest1 = new int[]{ 1,2,4,8,3 };
            int[] arraytest2 = new int[]{ 4,6,12,5,5,89 };
            int[] arraytest3 = new int[]{ 4,3,8,8,35,35,12 };
            int[] arraytest4 = new int[]{ 5,6,78,5 };

            System.out.println("result for arraytes1 ");
            findNumberAgainTest(arraytest1);
            System.out.println("result for arraytes2 ");
            findNumberAgainTest(arraytest2);
            System.out.println("result for arraytes3 ");
            findNumberAgainTest(arraytest3);
            System.out.println("result for arraytes4 ");
            findNumberAgainTest(arraytest4);

    }
}

