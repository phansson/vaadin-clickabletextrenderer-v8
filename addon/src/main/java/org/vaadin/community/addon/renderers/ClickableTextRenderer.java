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

import com.vaadin.ui.renderers.ClickableRenderer;

/**
 * A renderer which makes some text look like a hyperlink and the
 * text is clickable. The link is <i>not</i> a normal HTML link as
 * in {@code <a href="blabla">link</a>} but is simply some text
 * which can have a click listener attached to it.
 * 
 * <p>The renderer expects the PRESENTATION type of the column
 * to be of type {@code String}.
 * 
 * @see ClickableTextRendererAdv
 */
public class ClickableTextRenderer<T> extends ClickableRenderer<T, String> {

    /**
     * Creates a new clickable text renderer.
     *
     * @param nullRepresentation the textual representation of {@code null}
     * value
     */
    public ClickableTextRenderer(String nullRepresentation) {
        super(String.class, nullRepresentation);
    }

    /**
     * Creates a new clickable text renderer and adds the given click listener
     * to it.
     *
     * @param listener the click listener to register
     * @param nullRepresentation the textual representation of {@code null}
     * value
     */
    public ClickableTextRenderer(RendererClickListener listener,
            String nullRepresentation) {
        this(nullRepresentation);
        addClickListener(listener);
    }

    /**
     * Creates a clickable text renderer.
     */
    public ClickableTextRenderer() {
        this("");
    }

    /**
     * Creates a new clickable text renderer and adds the given click listener
     * to it.
     *
     * @param listener the click listener to register
     */
    public ClickableTextRenderer(RendererClickListener listener) {
        this(listener, "");
    }

}
