# ClickableTextRenderer Add-on for Vaadin 8

This is a Renderer for Grid in Vaadin 8.

It allows text in a cell to be rendered as a clickable link. The typical use-case
is for **drill-down** within the Grid.

![linktextrenderer add-on demo](https://user-images.githubusercontent.com/1903550/33796636-0758fe6e-dcf9-11e7-97ee-4007ee0db255.png)

## Usage

The renderer inherits from `ClickableRenderer` so the use is the same.

Nevertheless, here's a taste:

Suppose your Grid has a column named "city". Then the renderer may be used
like this:

```java
// Define what to do when clicked
ClickableRenderer.RendererClickListener myListener
        = (ClickableRenderer.RendererClickEvent<YourGridClass> event) -> {
            // Do something here. Use event.getItem() to figure out
            // which row was clicked.
        };

// Add the renderer to some column
grid.getColumn("city").setRenderer(new ClickableTextRenderer(myListener));
```

For a complete demo see the demo project (under `/demo` in this project).

## It's not really a link

What the user sees walks and talks like a link, but it is not a link
in the normal HTML way, i.e. `<a href="...">text</a>`. This means the user
cannot hoover over the link and see where it will take him. You can,
however, create a tooltip for the link.

The text is styled with `v-link` and this it why it will display as if it was
a real link.

## Advanced use

`ClickableTextRenderer` renders `String` input and doesn't allow HTML.
It is simple to use.

However, `ClickableTextRendererAdv` is more advanced (hence the name) and
can be used when HTML text rendering is required or when there's a need
to set the link's tooltip (or 'description' as is the Vaadin terminology).
Use of `ClickableTextRendererAdv` will always require a `ValueProvider` because
it renders objects of type `ClickableText`, so this needs to be column's
Presentation type. It may seem cumbersome to have to convert to this
Presentation type but the advantage is that both the link text and the 
tooltip can depend on the value of the cell.

The demo project contains an example of usage of `ClickableTextRendererAdv`.



## Bug reports, contributions, etc

You are welcome to file a ticket here in GitHub's Issue Tracker. If you want
something changed / expanded upon then why not file a pull request?
