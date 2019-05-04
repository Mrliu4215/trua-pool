/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.tables.records;


import burst.pool.migrator.db.tables.Payouts;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PayoutsRecord extends UpdatableRecordImpl<PayoutsRecord> implements Record6<Long, Long, byte[], Long, Long, byte[]> {

    private static final long serialVersionUID = -680252386;

    /**
     * Setter for <code>pooldb.payouts.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pooldb.payouts.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pooldb.payouts.transactionId</code>.
     */
    public void setTransactionid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pooldb.payouts.transactionId</code>.
     */
    public Long getTransactionid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pooldb.payouts.senderPublicKey</code>.
     */
    public void setSenderpublickey(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>pooldb.payouts.senderPublicKey</code>.
     */
    public byte[] getSenderpublickey() {
        return (byte[]) get(2);
    }

    /**
     * Setter for <code>pooldb.payouts.fee</code>.
     */
    public void setFee(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pooldb.payouts.fee</code>.
     */
    public Long getFee() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pooldb.payouts.deadline</code>.
     */
    public void setDeadline(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pooldb.payouts.deadline</code>.
     */
    public Long getDeadline() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pooldb.payouts.attachment</code>.
     */
    public void setAttachment(byte... value) {
        set(5, value);
    }

    /**
     * Getter for <code>pooldb.payouts.attachment</code>.
     */
    public byte[] getAttachment() {
        return (byte[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, byte[], Long, Long, byte[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, byte[], Long, Long, byte[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Payouts.PAYOUTS.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Payouts.PAYOUTS.TRANSACTIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field3() {
        return Payouts.PAYOUTS.SENDERPUBLICKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Payouts.PAYOUTS.FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Payouts.PAYOUTS.DEADLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field6() {
        return Payouts.PAYOUTS.ATTACHMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getTransactionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component3() {
        return getSenderpublickey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component6() {
        return getAttachment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getTransactionid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value3() {
        return getSenderpublickey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDeadline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value6() {
        return getAttachment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value2(Long value) {
        setTransactionid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value3(byte... value) {
        setSenderpublickey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value4(Long value) {
        setFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value5(Long value) {
        setDeadline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord value6(byte... value) {
        setAttachment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PayoutsRecord values(Long value1, Long value2, byte[] value3, Long value4, Long value5, byte[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PayoutsRecord
     */
    public PayoutsRecord() {
        super(Payouts.PAYOUTS);
    }

    /**
     * Create a detached, initialised PayoutsRecord
     */
    public PayoutsRecord(Long dbId, Long transactionid, byte[] senderpublickey, Long fee, Long deadline, byte[] attachment) {
        super(Payouts.PAYOUTS);

        set(0, dbId);
        set(1, transactionid);
        set(2, senderpublickey);
        set(3, fee);
        set(4, deadline);
        set(5, attachment);
    }
}