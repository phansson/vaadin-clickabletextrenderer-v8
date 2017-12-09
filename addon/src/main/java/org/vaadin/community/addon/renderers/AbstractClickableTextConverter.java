/*
 * Copyright 2017 Vaadin Community.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.vaadin.community.addon.renderers;

import com.vaadin.data.Converter;
import com.vaadin.data.Result;
import com.vaadin.data.ValueContext;
import org.vaadin.community.addon.renderers.client.ClickableText;

/**
 * Converter base class which converts from MODEL type {@code String} into
 * PRESENTATION type {@code ClickableText}.
 * 
 * <p>Typically you'll only need to implement the
 * {@link #convertToPresentation(java.lang.String, com.vaadin.data.ValueContext) convertToPresentation}
 * method.
 * 
 * <p>If you need the Converter also to convert in the opposite direction,
 * from ClickableText into String, then you'll need to override 
 * {@link #convertToModel(org.vaadin.community.addon.renderers.client.ClickableText, com.vaadin.data.ValueContext) convertToModel}
 * too. This is not required if your column is read-only.
 */
public abstract class AbstractClickableTextConverter implements Converter<ClickableText, String> {

    /**
     * Override this if your grid column is editable.
     * This is rarely the case for columns that presents links, so by default
     * this method will throw {@code UnsupportedOperationException}. 
     */
    @Override
    public Result<String> convertToModel(ClickableText value, ValueContext context) {
        throw new UnsupportedOperationException("Not supported.");
    }

    @Override
    public abstract ClickableText convertToPresentation(String value, ValueContext context);



}
