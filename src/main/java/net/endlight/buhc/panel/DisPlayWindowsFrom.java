package net.endlight.buhc.panel;

import cn.nukkit.Player;
import net.endlight.buhc.panel.from.button.BaseIButton;
import net.endlight.buhc.tools.Utils;
import net.endlight.buhc.panel.from.GameFrom;


import java.util.LinkedHashMap;
import java.util.List;

/**
 * GUI菜单
 * @author SoBadFish
 * 2022/1/11
 */
public class DisPlayWindowsFrom {

    public static int FROM_ID = 155;

    public static int FROM_MAX_ID = 105478;

    public static LinkedHashMap<String, GameFrom> FROM = new LinkedHashMap<>();


    public static void disPlayerCustomMenu(Player player, String tag, List<BaseIButton> from){
        GameFrom bedWarFrom = new GameFrom(tag,"",getId());
        bedWarFrom.setBaseIButtons(from);
        FROM.put(player.getName(), bedWarFrom);
        bedWarFrom.disPlay(player);
    }


    public static int getId(){
        return Utils.rand(FROM_ID,FROM_MAX_ID);
    }

    public static int getId(int min,int max){
        return Utils.rand(min,max);
    }

}
