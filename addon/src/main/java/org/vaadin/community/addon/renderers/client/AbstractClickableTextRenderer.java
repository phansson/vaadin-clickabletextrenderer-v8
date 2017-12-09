/*
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
package org.vaadin.community.addon.renderers.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.InlineHTML;
import com.vaadin.client.renderers.ClickableRenderer;
import com.vaadin.client.widget.grid.RendererCellReference;

public abstract class AbstractClickableTextRenderer<T> extends ClickableRenderer<T, InlineHTML> {
    
    @Override
    public InlineHTML createWidget() {
        InlineHTML a = GWT.create(InlineHTML.class);
        a.addClickHandler(this);
        a.setStylePrimaryName("v-link");
        return a;
    }

    @Override
    public abstract void render(RendererCellReference cell, T data, InlineHTML inlineHTML);
}
