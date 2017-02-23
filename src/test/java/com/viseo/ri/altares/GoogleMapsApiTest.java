package com.viseo.ri.altares;

import org.junit.Ignore;
import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import java.io.IOException;

/**
 *
 */
public class GoogleMapsApiTest {
    private static String KEY = "";

    @Ignore
    @Test
    public void test() throws IOException, InterruptedException {

//        Observable.just(1, 2, 0, 3)
//                  .map(i -> {
//                      System.out.println(i);
//                      return i;
//                  })
//                  .map(i -> {
//                      if (i == 0) throw new IllegalArgumentException("toot");
//                      return 1d/i;
//                  })
//                  .retry((integer, throwable) -> true)
//                  .subscribe(System.out::println);



        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl("https://maps.googleapis.com")
                .build();
//
//        GoogleMapsApi googleMapsApi = retrofit.create(GoogleMapsApi.class);
//
////        Observable<JsonObject> search = googleMapsApi.search(KEY, "Wiss Pierre 3 Sentier de l'Écluse, 67114 Eschau, France");
////        search.subscribe(System.out::println);
////        Thread.sleep(10_000);
////        Response<JsonObject> response = search.execute();
////
////        JsonObject body = response.body();
////        JsonArray results = body.getAsJsonArray("results");
////        String placeId = results.get(0).getAsJsonObject().get("place_id").getAsString();
////        System.out.println("place_Id → " + placeId);
//
////        Observable<JsonObject> details = googleMapsApi.details(KEY, placeId);
////        Response<JsonObject> response2 = details.execute();
////        JsonObject body1 = response2.body();
////        String phoneNumber = body1.getAsJsonObject("result").get("international_phone_number").getAsString();
////
////        System.out.println(phoneNumber);
    }
}
