/**
 * The contents of this file are subject to the license and copyright
 * detailed in the LICENSE and NOTICE files at the root of the source
 * tree and available online at
 *
 * http://www.dspace.org/license/
 */
package org.dspace.app.rest.model.patch;

/**
 * Operation to track the "replace" operation to the given "path".
 *
 * @author Luigi Andrea Pascarelli (luigiandrea.pascarelli at 4science.it)
 */
public class ReplaceOperation extends Operation {

    public ReplaceOperation(String path, Object value) {
        super("replace", path, value);
    }

    public ReplaceOperation(String path, Object value, String reason) {
        super("replace", path, value, reason);
    }

}
