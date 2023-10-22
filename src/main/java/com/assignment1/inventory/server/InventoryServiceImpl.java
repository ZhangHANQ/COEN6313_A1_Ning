package com.assignment1.inventory.server;


import com.assignment1.inventory.grpc.InventoryServiceGrpc.InventoryServiceImplBase;
import com.assignment1.inventory.grpc.InventoryUserProto;
import com.assignment1.inventory.grpc.InventoryUserProto.PercentileResponse;
import com.assignment1.inventory.grpc.InventoryUserProto.InventoryID;
import com.assignment1.inventory.grpc.InventoryUserProto.InventoryIDRange;
import com.assignment1.inventory.grpc.InventoryUserProto.InventoryList;
import com.assignment1.inventory.grpc.InventoryUserProto.UpdateResponse;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.lang.reflect.Field;

public class InventoryServiceImpl extends InventoryServiceImplBase {

    List<InventoryRecord> inventoryRecordList = new ArrayList<>();

    public InventoryServiceImpl() {

        inventoryRecordList.add(new InventoryRecord("IN0001", "Item1", "Desc1", "$51.00", 25, "$12750.00", 29, 13, 50, true));
        inventoryRecordList.add(new InventoryRecord("IN0002", "Item2", "Desc2", "$93.00", 132, "$12276.00", 231, 4, 50, true));
        inventoryRecordList.add(new InventoryRecord("IN0003", "Item3", "Desc3", "$57.00", 151, "$8607.00", 114, 11, 150, true));
        inventoryRecordList.add(new InventoryRecord("IN0004", "Item4", "Desc4", "$19.00", 186, "$3534.00", 158, 6, 50, true));
        inventoryRecordList.add(new InventoryRecord("IN0005", "Item5", "Desc5", "$75.00", 62, "$4650.00", 39, 12, 50, true));
        inventoryRecordList.add(new InventoryRecord("IN0006", "Item6", "Desc6", "$11.00", 5, "$55.00", 9, 13, 150, true));

    }

    @Override
    public void searchByID(InventoryID request, StreamObserver<InventoryList> responseObserver) {

        System.out.print("Search Inventory ID:" + request.getID());

        InventoryList.Builder response = InventoryList.newBuilder();
        boolean found = false;

        for (InventoryRecord inventoryRecord : inventoryRecordList) {

            if (inventoryRecord.getInventoryID().equals(request.getID())) {
                response.setInventoryID(inventoryRecord.getInventoryID());
                response.setName(inventoryRecord.getName());
                response.setDescription(inventoryRecord.getDescription());
                response.setUnitPrice(inventoryRecord.getUnitPrice());
                response.setQuantityInStock(inventoryRecord.getQuantityInStock());
                response.setInventoryValue(inventoryRecord.getInventoryValue());
                response.setRecorderLevel(inventoryRecord.getRecorderLevel());
                response.setRecorderTimeInDays(inventoryRecord.getRecorderTimeInDays());
                response.setQuantityInRecorder(inventoryRecord.getQuantityInRecorder());
                response.setDiscontinued(inventoryRecord.isDiscontinued());
                found = true;
                break;
            }

        }

        if (found) {

            responseObserver.onNext(response.build());
        } else {
            System.out.println("Cannot find the record!");
        }

        responseObserver.onCompleted();
    }

    @Override
    public void searchByIDRange(InventoryIDRange request, StreamObserver<InventoryList> responseObserver) {

        String lowerBound = request.getIDStart();
        String upperBound = request.getIDEnd();

        for (InventoryRecord inventoryRecord : inventoryRecordList) {

            InventoryList.Builder response = InventoryList.newBuilder();
            String inventID = inventoryRecord.getInventoryID();

            if (inventID.compareTo(lowerBound) >= 0 && inventID.compareTo(upperBound) <= 0) {
                response.setInventoryID(inventoryRecord.getInventoryID());
                response.setName(inventoryRecord.getName());
                response.setDescription(inventoryRecord.getDescription());
                response.setUnitPrice(inventoryRecord.getUnitPrice());
                response.setQuantityInStock(inventoryRecord.getQuantityInStock());
                response.setInventoryValue(inventoryRecord.getInventoryValue());
                response.setRecorderLevel(inventoryRecord.getRecorderLevel());
                response.setRecorderTimeInDays(inventoryRecord.getRecorderTimeInDays());
                response.setQuantityInRecorder(inventoryRecord.getQuantityInRecorder());
                response.setDiscontinued(inventoryRecord.isDiscontinued());
                responseObserver.onNext(response.build());
            }

        }
        responseObserver.onCompleted();

    }
//    @Override
//    public void getDistribution(InventoryUserProto.PercentileRequest request,
//                                StreamObserver<InventoryUserProto.PercentileResponse> responseObserver) {
//
//        PercentileResponse.Builder response = PercentileResponse.newBuilder();
//        request.getKeyName();
//        double percentile = request.getPercentile();
//
//        int n = inventoryRecordList.size();
//        Collections.sort(inventoryRecordList, (a, b) -> Double.compare(a.getQuantityInStock(), b.getQuantityInStock()));
//
//        int position = (int) Math.ceil((percentile / 100.0) * (n - 1));
//        if (position >= 0 && position < n) {
//
//            InventoryRecord percentileRecord = inventoryRecordList.get(position);
//
//            response.setQuantityInStockPercentile(percentileRecord.getQuantityInStock());
//
//            responseObserver.onNext(response.build());
//
//        }
//    }

    @Override
    public void update(InventoryUserProto.UpdateRequest request,
                       StreamObserver<UpdateResponse> responseObserver) {
        String InventoryID = request.getInventoryID();
        String keyName = request.getId();
        int key_Value = request.getValue();
        UpdateResponse.Builder response = UpdateResponse.newBuilder();
        for (InventoryRecord inventoryRecord : inventoryRecordList) {
            if (inventoryRecord.getInventoryID().equals(InventoryID)) {
                Field[] fields = inventoryRecord.getClass().getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String name = field.getName();
                    if (name.equals(keyName)&&keyName.equals("QuantityInStock")){
                        inventoryRecord.setQuantityInStock(key_Value);
                        response.setReturnValue(true);
                    }else {
                        response.setReturnValue(false);
                    }
                }
            }
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}


