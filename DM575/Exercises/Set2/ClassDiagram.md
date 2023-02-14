# Exercise Set 2
## Class diagram
::: mermaid
classDiagram

    Image --|> Color
    class Image {
        +image(int width, int height)
        +image(int width, int height, Color background)
        +width() int
        +height() int
        +pixel(int x, int y) Color
        +setPixel(int x, int y, Color color) void
        +display() void
        +fromFile(String path) Image
    }
    class Color{
        +Color BLACK
        +Color WHITE
        +Color GRAY
        +Color RED
        +Color MAROON
        +Color LIME
        +Color GREEN
        +Color NAVY
        +Color YELLO
        +Color MAGENTA
        +Color CYAN
        +Color PINK
        +Color ORANG

        +Color(int rgb)
        +Color(int red, int green, int blue)
        +red() int
        +green() int
        +blue() int
        +rgb() int
    }
:::