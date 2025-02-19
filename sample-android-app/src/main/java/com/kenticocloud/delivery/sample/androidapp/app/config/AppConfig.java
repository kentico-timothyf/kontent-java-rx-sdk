/*
 * Copyright 2017 Kentico s.r.o. and Richard Sustek
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.kenticocloud.delivery.sample.androidapp.app.config;

import com.kenticocloud.delivery_core.models.item.TypeResolver;
import com.kenticocloud.delivery.sample.androidapp.data.models.Article;
import com.kenticocloud.delivery.sample.androidapp.data.models.Cafe;
import com.kenticocloud.delivery.sample.androidapp.data.models.Coffee;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import io.reactivex.functions.Function;

public class AppConfig {
    public final static String KENTICO_CLOUD_PROJECT_ID = "975bf280-fd91-488c-994c-2f04416e5ee3";

    public static List<TypeResolver<?>> getTypeResolvers(){

        // Type resolvers are responsible for creating the strongly typed object out of type
        List<TypeResolver<?>> typeResolvers = new ArrayList<>();

        // Cafe resolvers
        typeResolvers.add(new TypeResolver<>(Cafe.TYPE, new Function<Void, Cafe>() {
            @Nullable
            @Override
            public Cafe apply(@Nullable Void input) {
                return new Cafe();
            }
        }));

        /// Article resolver
        typeResolvers.add(new TypeResolver<>(Article.TYPE, new Function<Void, Article>() {
            @Nullable
            @Override
            public Article apply(@Nullable Void input) {
                return new Article();
            }
        }));

        /// Coffee resolver
        typeResolvers.add(new TypeResolver<>(Coffee.TYPE, new Function<Void, Coffee>() {
            @Nullable
            @Override
            public Coffee apply(@Nullable Void input) {
                return new Coffee();
            }
        }));

        return typeResolvers;
    }

}
