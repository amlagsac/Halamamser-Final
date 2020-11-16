package apc.entjava.halamamser;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import apc.entjava.halamamser.HomepageItem;

@Named
@RequestScoped
public class HomepageItemDeleteBean {
	
	private long itemId;

	private HomepageItem item;

	@Inject
	private HomepageItemFormBean homepageItemFormBean;

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
	
	public String removeItem() {
		this.homepageItemFormBean.getItems().removeIf(item ->{
			return item.getItemId().equals(this.itemId);
		});
		return "adminPage?faces-redirect=true";
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public HomepageItem getItem() {
		return item;
	}

	public void setItem(HomepageItem item) {
		this.item = item;
	}

	public HomepageItemFormBean getHomepageItemFormBean() {
		return homepageItemFormBean;
	}

	public void setHomepageItemFormBean(HomepageItemFormBean homepageItemFormBean) {
		this.homepageItemFormBean = homepageItemFormBean;
	}


}
