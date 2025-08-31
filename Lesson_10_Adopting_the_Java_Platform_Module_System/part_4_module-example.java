// file: module-info.java
module module.example {
    exports example.api; // Public API
    // internal classes remain hidden
    // example.internalPackage is not exported
}
