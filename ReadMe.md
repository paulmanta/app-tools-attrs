# Design-time attributes for custom views

Don't you like it how you can use attributes like `tools:text` with a `TextView` or other standard
Android views? _I do, they make development so much quicker!_ Don't you wish design-time attributes
worked with your own custom views as well? _One can only dream..._ **Then I have just the thing for
you!**

`AppToolsAttrs` is a single file library that makes that possible!

## What do I need to do?

First things first. Add the library to your dependencies.

	allprojects {
	    repositories {
	        maven { url 'https://jitpack.io' }
	    }
	}
	  
    dependencies {
        implementation 'com.github.paulmanta:app-tools-attrs:v1.0.0'
    }

You will need to define a design-time attribute for each of your existing attributes.

    <declare-styleable name="MyWidget">
        <attr name="title" format="string"/>
        <attr name="description" format="string"/>
        <attr name="thumbnail" format="reference"/>
        
        <attr name="tools_title" format="string"/>
        <attr name="tools_description" format="string"/>
        <attr name="tools_thumbnail" format="reference"/>
    </declare-styleable>
    
Then, when initializing your view, instead of reading attributes directly from a `TypedArray` use
`AppToolsAttrs`.

    TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.MyWidget, defStyleAttr, defStyleRes);
    try {
        setTitle(AppToolsAttrs.getString(a, isInEditMode(), R.styleable.MyWidget_title, R.styleable.MyWidget_tools_title));
        setDescription(AppToolsAttrs.getString(a, isInEditMode(), R.styleable.MyWidget_description, R.styleable.MyWidget_tools_description));
        setThumbnail(AppToolsAttrs.getDrawable(a, isInEditMode(), R.styleable.MyWidget_thumbnail, R.styleable.MyWidget_tools_thumbnail));
    }
    finally {
        a.recycle();
    }
    
## I have some questions...

- **Don't you think it's a bit cumbersome to duplicate all the existing attributes?**
  It is, this is by no means a perfect solution. On the other hand, you only have to do this once
  and then they can make your life easier whenever you're creating a new layout that includes your
  custom view. Design-time attributes would be doubly useful if you're writing a library to be used
  by other people.
- **Do design-time attribute names need to start with `tools_` to work?** There's absolutely no
  naming restrictions, you can use any convention you like.
- **Are there any other libraries that try to solve this problem?** Sure. Gil Sinclair-Julio's
  [SneakPeek](https://github.com/giljulio/sneakpeek) is a more high-tech solution that doesn't
  require you to duplicate attributes. Unfortunately, it's also incompatible with Android Studio's
  auto-complete.