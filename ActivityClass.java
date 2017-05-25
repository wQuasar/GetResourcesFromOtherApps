...

// Get the package manager
PackageManager manager = getPackageManager();
try {
    // Must know the name of the package
    ApplicationInfo applicationInfo = manager.getApplicationInfo("<package_name>",
            PackageManager.GET_META_DATA);
            
    // Access the resources of the other app
    Resources res = manager.getResourcesForApplication(applicationInfo);
    
    // Get the resource identifier from the name of the resource
    int iconResId = res.getIdentifier("<res_name>", "drawable",
            "<package_name>");

    // Get the actual resource
    Drawable drawable = res.getDrawable(iconResId, getTheme());
    
    // -- Do awesome stuff with drawable here --

} catch (PackageManager.NameNotFoundException e) {
    // Herp Derp
    e.printStackTrace();
}

...
