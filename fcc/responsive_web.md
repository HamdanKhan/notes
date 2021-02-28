## Responsive Web Design Certification 

My notes for fcc [curriculum](https://www.freecodecamp.org/learn)

### Basic HTML and HTML5 

* Machine readable 
* Markup through tags 
* W3C develops Web standards 
* eg
  * HTML5 doc type ``` <!DOCTYPE html> ``` 
  * Heading ``` <h1>Hello World</h1> ``` 
  * Paragraph ```<p>Lorem ipsum<p>``` 
  * Comments ```<!-- comments -->``` 
* HTML5 introduces more descriptive HTML tags. 
These include main, header, footer, nav, video, article, section and others.
* adding images 
  * ```<img src="https://www.freecatphotoapp.com/your-image.jpg">```
  * img tag is self closing
* a (anchor)
  * in same window ```<a href="https://freecodecamp.org">this links to freecodecamp.org </a>```
  * in a new window ```<a href="https://freecatphotoapp.com" target="_blank">cat photos </a>```
  * dead link href="#"
  * internal links ```<a href="#contacts-header">Contacts\</a>```
* lists 
    ``` 
    <!-- ordered -->
    <ol>
        <li>Garfield</li>
        <li>Sylvester</li>
    </ol> 
    <!-- un ordered -->  
    <ul>
        <li>milk</li>
        <li>cheese</li>
    </ul>
    ```
* text field + placeholder
  ```
  <input type="text" placeholder="this is placeholder text">
  ``` 
* form
    ```
    <form action="/url-where-you-want-to-submit-form-data">
        <input>
    </form>
    ```
* submit
    ```
    <button type="submit">this button submits the form</button>
    ```
* required
    ```
    <input type="text" required>
    ```
* radio buttons
    ```
    <label for="indoor"> 
        <input id="indoor" value="indoor" type="radio" name="indoor-outdoor" checked> Indoor 
    </label>
    <label for="outdoor"> 
        <input id="outdoor" value="outdoor" type="radio" name="indoor-outdoor"> Outdoor 
    </label>
    ```
### Basic CSS

* CSS tells the browser how to display the text
* case-sensitive
* control 
  * color
  * fonts
  * positioning
  * spacing
  * sizing
  * decorations
  * transitions
* apply in three ways 
  * inline (in HTML using style attribute)
  * in style tag in HTML 
  * external style sheet file (preferred) 
* selector (#/./tagName) to target an HTML element in the DOM
* inline style 
    ``` <h2 style="color: blue;">CatPhotoApp</h2> ```
* style tag 
    ```
    <style>
        h2 {
            color: red;
        }
    </style>
    ```
* css class in style tag 
    ```
    <style>
        .blue-text {
            color: blue;
        }
    </style>
    ```
* CSS class above can be applied to multiple HTML elements
* font prop for all h1 elements
    ```
    h1 {
        font-family: sans-serif;
        font-size: 30px;
    }
    ```
* https://fonts.google.com
* "degrade" to another font
    ```
    p {
        font-family: Helvetica, sans-serif;
    }   
    ```
* elements width ``` width: 500px; ```
* border style
    ```
    .thin-red-border {
        border-radius: 10px; 
        border-color: red;
        border-width: 5px;
        border-style: solid;
    }
    ```
* circle - ``` border-radius: 50%; ```
* bgcolor - ``` background-color: green; ```
* id attribute - should be unique ``` #id-to-div ```
* An id also has a higher specificity (importance) than a class
* All HTML elements are essentially little rectangles
  * Three important properties control the space that surrounds each HTML element: 
    * padding 
      * padding or padding-top, padding-right, padding-bottom, and padding-left
      * or padding: 10px 20px 10px 20px;
    * border 
    * margin
      * margin-top, margin-right, margin-bottom, and margin-left
      * or margin: 10px 20px 10px 20px;
  * -ve margin - If you set an element's margin to a negative value, the element will grow larger
* selectors 
    ```
    [type='radio'] {
        margin: 20px 0px 20px 0px;
    } 
    ```
* length unit - details from [dev tips](https://www.youtube.com/watch?v=qrduUUdxBSY)
  * absolute
    * px - pixels 
    * in - inches 
    * cm - centimeters 
    * mm - millimeters 
    * pt - points
    * pc - picas 
  * relative
    * % - percentages 
    * em and rem - font-size
    * ex and ch - character-size 
    * vw and vh - viewport dimensions 
    * vmax - viewport max
    * vmin - viewpot min 
  * Relative units are based on 
    * The parents dimensions (%)
    * The currently declared font-attributes (em, rem, ex, ch)
    * The viewport dimensions (vw, vh, vmin, vmax)
      * width: 50vw; (50% of viewport/100 boxes per viewport) 
      * same works with height (height:50vh)
      * vmin (min of viewport width or height)
      * vmax (max of viewport width or height)
    * Font attribute based units
      * ex (height of character "x" )
      * ch (width of character "0")
      * em (parent font-size:10px then childe 1em = 10px) cascade 
      * rem (:root font-size) does not cascade
  * Absolute lengths 
    * Are self-regulating, they do not base their dimension on anything else on the page
    * Are based on real-world measurements 
      * Pixel
        * Low Density - 1 unit = 1 pixel
        * Medium Density - 1 unit = 4 pixel 
        * High Density - 1 unit = 9 pixel 
* 

### Applied Visual Design 

### Applied Accessibility 

### Responsive Web Design Principles 

### CSS Flexbox 

### CSS Grid 

### Responsive Web Design Projects 

1) [Tribute Page](https://codepen.io/hamdan/full/EyVzZW)


<!--
https://guides.github.com/features/mastering-markdown/
https://www.markdownguide.org/basic-syntax/
--s>