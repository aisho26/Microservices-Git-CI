package com.DAO;
import java.util.ArrayList;
import com.Model.Item;
import java.util.Iterator;

public class ItemDao {
   //hardcode new items
   private ArrayList<Item> itemList = new ArrayList<>();

   public ItemDao(){ 
   itemList.add(new Item(01, "item 1", "this is item 1", "//image-path1", 12.0F));
   itemList.add(new Item(02, "item 2", "this is item 2", "//image-path2", 22.0F));
   itemList.add(new Item(03, "item 3", "this is item 3", "//image-path3", 36.0F));
   itemList.add(new Item(04, "item 4", "this is item 4", "//image-path4", 48.0F));
   itemList.add(new Item(05, "item 5", "this is item 5", "//image-path5", 12.0F));
   }

   public void createItem(Item item){
    itemList.add(item);
   }

   public Item getItem(int Id){
    for (Item i: itemList ){
        if(i.getId()==Id){
            return i;
        }
    }
    return null; //catch as exception in the controller class
   }

   public ArrayList<Item> getItemList(){
    
    return itemList; //catch as exception in the controller class
   }

   public void updateItem(Item item){
    for (Item i: itemList ){
        if(i.getId()==item.getId()){
            i.setTitle(item.getTitle());
            i.setDesc(item.getDesc());
            i.setImagePath(item.getImagePath());
            i.setPrice(item.getPrice());

        }
    }
   }

   public void deleteItem(Item item){
    Iterator<Item> itr = itemList.iterator();
    while(itr.hasNext()){
        Item x = (Item)itr.next();
        if(x.getId() == item.getId()){
            itr.remove();
        }
    }
   }



}
