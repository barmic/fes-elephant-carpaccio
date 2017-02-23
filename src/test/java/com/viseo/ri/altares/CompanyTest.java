package com.viseo.ri.altares;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThat;


/**
 *
 */
public class CompanyTest {
    @Test
    public void if_coma_is_in_field_dont_split_field() throws ExecutionException, InterruptedException {
        // GIVEN
        String input = "`38846`,`3,78943E+13`,`LA FREGATE`,``,`\"`,`\"`,``,``,`62 RUE SAINT DIDIER`,``,`FRANCE`,`nd`,``,``,``";

        // WHEN
        CompletableFuture<Company> future = new CompletableFuture<>();
        Company.factory(input).subscribe(future::complete);

        // THEN
        Company company = future.get();
        assertThat(company.ref()).isEqualTo("38846");
        assertThat(company.rs1()).isEqualTo("LA FREGATE");
        assertThat(company.rs2()).isEmpty();
        assertThat(company.codePostal()).isEmpty();
    }
}