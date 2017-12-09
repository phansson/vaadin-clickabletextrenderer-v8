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
package org.vaadin.community.addon.renderers;

import org.vaadin.community.addon.renderers.client.ClickableText;
import com.vaadin.ui.renderers.ClickableRenderer;
import java.io.Serializable;

/**
 * A renderer which makes some text look like a hyperlink and the
 * text is clickable. The link is <i>not</i> a normal HTML link as
 * in {@code <a href="blabla">link</a>} but is simply some text
 * which can have a click listener attached to it.
 * 
 * <p>This form allows the text to be HTML and furthermore supports
 * tooltip on the link.
 * 
 * <p>The renderer expects the PRESENTATION type of the column
 * to be of type {@link ClickableText} so a {@code Converter}
 * will be needed on the column as well. {@link AbstractClickableTextConverter}
 * provides a quick way to create such a converter.
 */
public class ClickableTextRendererAdv<T> extends ClickableRenderer<T, ClickableText>
        implements Serializable {

    private static final long serialVersionUID = 446324529862L;

    /**
     * Creates a new clickable text renderer.
     *
     * @param nullRepresentation the textual representation of {@code null}
     * value
     */
    public ClickableTextRendererAdv(String nullRepresentation) {
        super(ClickableText.class, nullRepresentation);
    }

    /**
     * Creates a new clickable text renderer and adds the given click listener
     * to it.
     *
     * @param listener the click listener to register
     * @param nullRepresentation the textual representation of {@code null}
     * value
     */
    public ClickableTextRendererAdv(RendererClickListener listener,
            String nullRepresentation) {
        this(nullRepresentation);
        addClickListener(listener);
    }

    /**
     * Creates a clickable text renderer.
     */
    public ClickableTextRendererAdv() {
        this("");
    }

    /**
     * Creates a new clickable text renderer and adds the given click listener
     * to it.
     *
     * @param listener the click listener to register
     */
    public ClickableTextRendererAdv(RendererClickListener listener) {
        this(listener, "");
    }

}
