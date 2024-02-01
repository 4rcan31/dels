package com.siman.creditos.backing;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.siman.creditos.entity.IConvertible;

@FacesConverter(value="genericConverter")
public class GenericSelectionConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		IConvertible ret = null;
        if (component != null) {
            List<UIComponent> childs = component.getChildren();
            UISelectItems items = null;
            if (childs != null) {
                for (UIComponent ui : childs) {
                    if (ui instanceof UISelectItems) {
                        items = (UISelectItems) ui;
                        break;
                    } else if (ui instanceof UISelectItem) {
                        UISelectItem item = (UISelectItem) ui;
                        try {
                            IConvertible val = (IConvertible) item.getItemValue();
                            if (value.equals("" + val.getId())) {
                                ret = val;
                                break;
                            }
                        } catch (Exception e) {
                        }
                    }
                }
            }

            if (items != null) {
            	@SuppressWarnings("unchecked")
                List<IConvertible> values = (List<IConvertible>) items.getValue();
                if (values != null) {
                    for (IConvertible val : values) {
                        if (value.equals("" + val.getId())) {
                            ret = val;
                            break;
                        }
                    }
                }
            }
        }
        return ret;
    }


	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
        String ret = "";
        if (value != null && value instanceof IConvertible) {
        	IConvertible m = (IConvertible) value;
            if (m != null) {
                String id = m.getId();
                if (id != null) {
                    ret = id.toString();
                }
            }
        }
        return ret;
    }
}