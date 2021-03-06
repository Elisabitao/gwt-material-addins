package gwt.material.design.addins.client.ui;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
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
 * #L%
 */

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import gwt.material.design.client.base.AbstractIconButton;

//@formatter:off

/**
 * SubHeaders are special list tiles that delineate distinct sections of a list or grid list and are typically related
 * to the current filtering or sorting criteria. Subheader tiles are either displayed inline with tiles or can be
 * associated with content, for example, in an adjacent column.
 *
 * <h3>XML Namespace Declaration</h3>
 * <pre>
 * {@code
 * xmlns:m.addins='urn:import:gwt.material.design.addins.client.ui'
 * }
 * </pre>
 *
 * <h3>UiBinder Usage:</h3>
 * <pre>
 *{@code <m.addins:MaterialSubHeader text="Subheader" textColor="pink" />}
 * </pre>
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#subheaders">Material Subheader</a>
 * @author kevzlou7979
 */
//@formatter:on
public class MaterialSubHeader extends AbstractIconButton{

    public MaterialSubHeader() {
        setStyleName("subheader");
    }

    @Override
    protected Element createElement() {
        return Document.get().createDivElement();
    }
}
