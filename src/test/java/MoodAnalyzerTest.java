import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MoodAnalyzerTest {
    @Test
    public void givenNullMoodShouldReturnHappy()  {
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer(null);
        String mood = null;
        try {
            ExpectedException exceptionRule =ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyzer.analysemood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

}

