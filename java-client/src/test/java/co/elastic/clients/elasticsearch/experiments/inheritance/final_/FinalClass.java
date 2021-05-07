/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.experiments.inheritance.final_;

import co.elastic.clients.elasticsearch.experiments.inheritance.child.ChildClass;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.util.ObjectBuilder;

import javax.json.stream.JsonGenerator;
import java.util.Objects;

/**
 * A concrete class that inherits a parent class but has no child classes
 */
public final class FinalClass extends ChildClass {

    private final String finalField;

    public FinalClass(Builder builder) {
        super(builder);
        this.finalField = Objects.requireNonNull(builder.finalField, "finalField");
    }

    public String finalField() {
        return this.finalField;
    }

    @Override
    protected void toJsonpInternal(JsonGenerator generator, Params params) {
        super.toJsonpInternal(generator, params);
        generator.write("finalField", this.finalField);
    }

    //---------------------------------------------------------------------------------------------

    public static class Builder
        extends ChildClass.AbstractBuilder<Builder>
        implements ObjectBuilder<FinalClass> {

        private String finalField;

        public Builder finalField(String value) {
            this.finalField = value;
            return self();
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public FinalClass build() {
            return new FinalClass(this);
        }
    }

    //---------------------------------------------------------------------------------------------

    private static void setupFinalClassParser(JsonpObjectParser<Builder> op) {
        ChildClass.setupChildClassParser(op);
        op.add(Builder::finalField, JsonpValueParser.stringParser(), "finalField");
    }

    // Static methods cannot hide other static methods with a different return type or the same erased signature.
    // Two possible solutions:
    // - use different names, but having SomeClass.someClassParser() has some redundancy in the name
    // - use a static field, as a static field can hide a static field of a different type in the parent class
    //
    // Our choice is to use different names for protected/private parser setup methods are they are hidden from
    // the user and use a static field for the final parser, so that we can uniformly write SomeClass.PARSER
    // (even if users should rarely have to interact directly with the parser).

    public static final JsonpValueParser<FinalClass> JSONP_PARSER = JsonpObjectBuilderParser.create(
        Builder::new, FinalClass::setupFinalClassParser
    );

}