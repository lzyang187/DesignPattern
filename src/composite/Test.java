package composite;

/**
 * @author: cyli8
 * @date: 2019-05-28 18:44
 */
public class Test {
    public static void main(String[] args) {
        //构造正餐的菜单
        AbstractMenuComponent dinnerMenu = new Menu("正餐菜单");
        dinnerMenu.add(new MenuItem("油焖大虾", 40));
        dinnerMenu.add(new MenuItem("红烧鱼", 30));
        //构造煎饼的菜单
        AbstractMenuComponent pancakeMenu = new Menu("煎饼菜单");
        pancakeMenu.add(new MenuItem("韭菜盒子", 5));
        pancakeMenu.add(new MenuItem("鸡蛋灌饼", 5));
        //构造甜点菜单
        AbstractMenuComponent dessertMenu = new Menu("甜点菜单");
        dessertMenu.add(new MenuItem("冰激凌", 6));
        dessertMenu.add(new MenuItem("西瓜拼盘", 20));
        //甜点菜单是正餐的子菜单
        dinnerMenu.add(dessertMenu);
        //总菜单
        AbstractMenuComponent allMenu = new Menu("总菜单");
        allMenu.add(dinnerMenu);
        allMenu.add(pancakeMenu);
        //服务员开始打印菜单
        Waiter waiter = new Waiter(allMenu);
        waiter.prient();
    }
}
