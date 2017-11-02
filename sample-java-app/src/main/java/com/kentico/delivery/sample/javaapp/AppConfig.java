/*
 * Copyright 2017 Kentico s.r.o. and Richard Sustek
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.kentico.delivery.sample.javaapp;

import com.kentico.delivery.core.models.item.TypeResolver;
import com.kentico.delivery.sample.javaapp.models.Article;
import com.kentico.delivery.sample.javaapp.models.Cafe;
import com.kentico.delivery.sample.javaapp.models.Coffee;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Function;

public class AppConfig {
    public final static String KENTICO_CLOUD_PROJECT_ID = "683771be-aa26-4887-b1b6-482f56418ffd";
    public final static String PREVIEW_API_KEY = "ew0KICAiYWxnIjogIkhTMjU2IiwNCiAgInR5cCI6ICJKV1QiDQp9.ew0KICAidWlkIjogInVzcl8wdlFZQkNxQXZybm81cmlmSG5pWUVHIiwNCiAgImVtYWlsIjogInJpY2hhcmRzQGtlbnRpY28uY29tIiwNCiAgInByb2plY3RfaWQiOiAiNjgzNzcxYmUtYWEyNi00ODg3LWIxYjYtNDgyZjU2NDE4ZmZkIiwNCiAgImp0aSI6ICJ0d1lhZ2FPbFlXaWdSVWFaIiwNCiAgInZlciI6ICIxLjAuMCIsDQogICJnaXZlbl9uYW1lIjogIlJpY2hhcmQiLA0KICAiZmFtaWx5X25hbWUiOiAiU3VzdGVrIiwNCiAgImF1ZCI6ICJwcmV2aWV3LmRlbGl2ZXIua2VudGljb2Nsb3VkLmNvbSINCn0.BirY08kvBwh6ExBhHInGMMUpHk4QdQOSqLb-IIn2NJ8";

    public static List<TypeResolver<?>> getTypeResolvers(){

        // Type resolvers are responsible for creating the strongly typed object out of type
        List<TypeResolver<?>> typeResolvers = new ArrayList<>();

        // Cafe resolvers
        typeResolvers.add(new TypeResolver<>(Cafe.TYPE, new Function<Void, Cafe>() {
            @Override
            public Cafe apply(Void input) {
                return new Cafe();
            }
        }));

        /// Article resolver
        typeResolvers.add(new TypeResolver<>(Article.TYPE, new Function<Void, Article>() {
            @Override
            public Article apply(Void input) {
                return new Article();
            }
        }));

        /// Coffee resolver
        typeResolvers.add(new TypeResolver<>(Coffee.TYPE, new Function<Void, Coffee>() {
            @Override
            public Coffee apply(Void input) {
                return new Coffee();
            }
        }));

        return typeResolvers;
    }

}