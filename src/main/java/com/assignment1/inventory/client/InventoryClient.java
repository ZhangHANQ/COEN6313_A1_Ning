package com.assignment1.inventory.client;

import com.assignment1.inventory.grpc.InventoryServiceGrpc;
import com.assignment1.inventory.grpc.InventoryUserProto;
import com.assignment1.inventory.grpc.InventoryUserProto.InventoryID;
import com.assignment1.inventory.grpc.InventoryUserProto.InventoryList;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import com.assignment1.inventory.grpc.InventoryUserProto.UpdateRequest;
import com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse;

public class InventoryClient {

    public static void main(String[] args) {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        InventoryServiceGrpc.InventoryServiceBlockingStub stub
                = InventoryServiceGrpc.newBlockingStub(channel);

//        InventoryList inventoryList = stub.searchByID(InventoryID.newBuilder().setID("INT003").build());
        UpdateResponse updateResponse = stub.update(UpdateRequest.newBuilder().setInventoryID("IN0004").setId("QuantityInStock").setValue(78).build());
////        System.out.println("Response received from server:\n" + inventoryList);
        System.out.println("Response received from server:\n"+updateResponse);

        channel.shutdown();

    }

}
