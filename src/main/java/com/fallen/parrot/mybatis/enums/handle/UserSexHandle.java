package com.fallen.parrot.mybatis.enums.handle;

import com.fallen.parrot.mybatis.enums.UserSexEnum;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSexHandle implements TypeHandler<UserSexEnum> {

    @Override
    public void setParameter(PreparedStatement ps, int i, UserSexEnum parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, parameter.getValue());
    }

    @Override
    public UserSexEnum getResult(ResultSet rs, String columnName) throws SQLException {
        return UserSexEnum.int2Enum(rs.getInt(columnName));
    }

    @Override
    public UserSexEnum getResult(ResultSet rs, int columnIndex) throws SQLException {
        return UserSexEnum.int2Enum(rs.getInt(columnIndex));
    }

    @Override
    public UserSexEnum getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return UserSexEnum.int2Enum(cs.getInt(columnIndex));
    }
}
