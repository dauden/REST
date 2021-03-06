package org.rest.sec.test;

import org.junit.runner.RunWith;
import org.rest.common.persistence.model.INameableEntity;
import org.rest.common.web.base.AbstractLogicRestIntegrationTest;
import org.rest.sec.spring.client.ClientTestConfig;
import org.rest.sec.spring.context.ContextConfig;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ClientTestConfig.class, ContextConfig.class }, loader = AnnotationConfigContextLoader.class)
public abstract class SecLogicRestIntegrationTest<T extends INameableEntity> extends AbstractLogicRestIntegrationTest<T> {

    public SecLogicRestIntegrationTest(final Class<T> clazzToSet) {
        super(clazzToSet);
    }

}
