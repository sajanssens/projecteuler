package nl.bramjanssens.problem1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MainTest {

    @Test
    public void calculate() {
        assertThat(Main.calculate(10), is(23));
    }



}