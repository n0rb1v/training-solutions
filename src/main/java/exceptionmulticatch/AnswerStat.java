//package exceptionmulticatch;
//
//import java.util.logging.Logger;
//
//public class AnswerStat {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(AnswerStat.class);
//    private BinaryStringConverter converter;
//
//    public AnswerStat(BinaryStringConverter converter) {
//        this.converter = converter;
//    }
//
//    public boolean[] convert(String s) {
//        try {
//            return converter.binaryStringToBooleanArray(s);
//        } catch (NullPointerException | IllegalArgumentException e) {
//            //LOGGER.error(e,e.getMessage());
//            throw new InvalidBinaryStringException(e);
//        }
//    }
//
//    public int answerTruePercent(String answers) {
//        boolean[] booleans = convert(answers);
//        int numberOfTrue = 0;
//        for (int i = 0; i < booleans.length; i++) {
//            if (booleans[i]) {
//                numberOfTrue++;
//            }
//        }
//        return (int) Math.round((double) numberOfTrue / booleans.length * 100);
//    }
//}
