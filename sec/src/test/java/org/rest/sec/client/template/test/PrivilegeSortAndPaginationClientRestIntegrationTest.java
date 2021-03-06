package org.rest.sec.client.template.test;

import org.rest.common.client.IEntityOperations;
import org.rest.sec.client.template.PrivilegeClientRestTemplate;
import org.rest.sec.model.Privilege;
import org.rest.sec.model.PrivilegeEntityOpsImpl;
import org.rest.sec.test.SecSortAndPaginationClientRestIntegrationTest;
import org.springframework.beans.factory.annotation.Autowired;

public class PrivilegeSortAndPaginationClientRestIntegrationTest extends SecSortAndPaginationClientRestIntegrationTest<Privilege> {

    @Autowired
    private PrivilegeClientRestTemplate clientTemplate;
    @Autowired
    private PrivilegeEntityOpsImpl entityOps;

    public PrivilegeSortAndPaginationClientRestIntegrationTest() {
        super();
    }

    // tests

    // template method

    @Override
    protected final PrivilegeClientRestTemplate getAPI() {
        return clientTemplate;
    }

    @Override
    protected final IEntityOperations<Privilege> getEntityOps() {
        return entityOps;
    }

}
