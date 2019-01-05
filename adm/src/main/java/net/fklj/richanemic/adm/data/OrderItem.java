package net.fklj.richanemic.adm.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    private int id;

    private int orderId;

    private int productId;

    private int variantId;

    private int quantity;

}
