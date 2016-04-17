/*
 * Copyright (C) 2016 drakeet.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.drakeet.mailotto;

/**
 * Created by drakeet(http://drakeet.me)
 * Date: 16/3/27 21:37
 */
public class Mail<T> {

    public Class<?> from;
    public Class<?> to;
    public T content;


    public Mail(T content, Class<?> to) {
        this(content, to, null);
    }


    public Mail(T content, Class<?> to, Class<?> from) {
        this.to = to;
        this.from = from;
        this.content = content;
    }
}
