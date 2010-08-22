/*
 * Copyright 2010 Ed Venaglia
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

package net.venaglia.nondairy.soylang.lexer.cupparser.structure.tag;

import net.venaglia.nondairy.soylang.lexer.cupparser.structure.IterableSequence;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ed
 * Date: Jul 24, 2010
 * Time: 6:48:47 PM
 */
public class BeginIteratorTag extends BeginTag {

    private final IterableSequence iterableSequence;

    public BeginIteratorTag(String command,
                            IterableSequence iterableSequence,
                            List<Attribute> attributes,
                            List<Directive> directives) {
        super(command, attributes, directives);
        this.iterableSequence = iterableSequence == null ? new IterableSequence(null) : iterableSequence;
    }

    public IterableSequence getIterableSequence() {
        return iterableSequence;
    }
}
