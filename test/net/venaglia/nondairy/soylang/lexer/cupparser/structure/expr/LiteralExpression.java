/*
 * Copyright 2010 - 2012 Ed Venaglia
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package net.venaglia.nondairy.soylang.lexer.cupparser.structure.expr;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jul 31, 2010
 * Time: 4:01:35 PM
 */
public abstract class LiteralExpression<T> implements Expression {

    private final T value;

    protected LiteralExpression(T value) {
        this.value = value;
    }

    public <T> T getValue(Class<T> conversion) {
        return Eval.coerce(value, conversion);
    }

    public T getValue() {
        return value;
    }
}
