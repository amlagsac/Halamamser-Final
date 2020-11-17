package apc.entjava.halamamser;

//Initialization of Imports
import java.util.List;
import java.util.stream.Collectors;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import apc.entjava.halamamser.HomepageItem;

//Declaration of @RequestScoped and @Named
@Named
@RequestScoped
public class HomepageItemDeleteBean {

	//Declaration of long itemId
	private long itemId;

	//Calling of HomepageItem class
	private HomepageItem item;

	//Inject HomepageItemFormBean class
	@Inject
	private HomepageItemFormBean homepageItemFormBean;

	//Function for getting the details of a product according of its itemId
	public void fetchItem() {
		List<HomepageItem> items = this.homepageItemFormBean.getItems().stream().filter(i -> {
			return i.getItemId() == itemId;
		}).collect(Collectors.toList());

		if (items.isEmpty()) {
			this.item = null;
		} else {
			this.item = items.get(0);
		}

	}

	//Function for removing the record of the itemId with return to the adminpage
	public String removeItem() {
		this.homepageItemFormBean.getItems().removeIf(item ->{
			return item.getItemId().equals(this.itemId);
		});
		return "adminPage?faces-redirect=true";
	}

	//Getter for itemId
	public long getItemId() {
		return itemId;
	}

	//Setter for itemId
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	//Getter of HomepageItem class
	public HomepageItem getItem() {
		return item;
	}

	//Setter of HomepageItem class
	public void setItem(HomepageItem item) {
		this.item = item;
	}

	//Getter of HomepageItemFormBean class
	public HomepageItemFormBean getHomepageItemFormBean() {
		return homepageItemFormBean;
	}

	//Setter of HomepageItemFormBean class
	public void setHomepageItemFormBean(HomepageItemFormBean homepageItemFormBean) {
		this.homepageItemFormBean = homepageItemFormBean;
	}

}
