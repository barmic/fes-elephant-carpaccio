package com.viseo.ri.altares;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
public class UtilsTest {
    @Test
    public void if_input_contain_codepostal_return_all_without_codepostal() {
        // GIVEN
        String input = "13510 Eguilles";

        // WHEN
        String extractedData = Utils.removeCodePostal(input);

        // THEN
        assertThat(extractedData).isEqualTo("Eguilles");
    }

    @Test
    public void if_input_not_contains_codepostal_return_all() {
        // GIVEN
        String input = "lorem ipsum";

        // WHEN
        String extractedData = Utils.removeCodePostal(input);

        // THEN
        assertThat(extractedData).isEqualTo(input);
    }

}