package io.gifto.wallet.model;

import io.gifto.wallet.R;
import io.gifto.wallet.utils.Constants;
import io.gifto.wallet.utils.Utils;

/**
 * Created by thongnguyen on 10/14/17.
 */

public enum WalletCurrency {

    ROSE_COIN("RSC", "RoseCoin"),
    GIFTO("GTO", "Gifto"),
    KRYPTOR("KRYPTOR", "Kryptor");

    private String code;
    private String name;

    WalletCurrency(String code, String name)
    {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static String GetNameByCode(String code)
    {
        if (!Utils.isStringValid(code))
            return "";

        if (Constants.IS_ROSECOIN && code.equals(ROSE_COIN.getCode()))
            return ROSE_COIN.getName();
        if (code.equals(GIFTO.getCode()))
            return GIFTO.getName();
        if (code.equals(KRYPTOR.getCode()))
            return KRYPTOR.getName();

        return "";
    }

    public static int getIconResourceByCode(String code)
    {
        if (!Utils.isStringValid(code))
            return R.drawable.gifto;

        if (Constants.IS_ROSECOIN && code.equals(ROSE_COIN.getCode()))
            return R.drawable.rosecoin;
        if (code.equals(GIFTO.getCode()))
            return R.drawable.gifto;
        if (code.equals(KRYPTOR.getCode()))
            return R.drawable.kryptor;

        return R.drawable.gifto;
    }
}
